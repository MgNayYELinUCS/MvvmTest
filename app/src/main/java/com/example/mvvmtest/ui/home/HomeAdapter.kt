package com.example.mvvmtest.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmtest.data.StudentModel
import com.example.mvvmtest.databinding.StudentItemBinding

class HomeAdapter(val list: List<StudentModel>) : RecyclerView.Adapter<HomeAdapter.MyHolder>(){

     class MyHolder(itemView: StudentItemBinding) : RecyclerView.ViewHolder(itemView.root) {
        var studentItemBinding:StudentItemBinding? = null
        init {
            studentItemBinding = itemView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return  MyHolder(StudentItemBinding.inflate(LayoutInflater.from(parent.context),parent,false));
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.studentItemBinding!!.txtName.text = list[position].name
        holder.studentItemBinding!!.txtAge.text = list[position].age.toString()
    }

}