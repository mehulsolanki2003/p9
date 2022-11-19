package com.example.p9

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate

class SMSViewAdapter(context: Context, private val array:ArrayList<SMSView>):
    ArrayAdapter<SMSView>(context,array.size,array) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //val currentItemView:View = LayoutInflater.from(context).inflate(R.layout.sms_item_view, parent, false)
        // get the position of the view from the ArrayAdapter
        val currentSms: SMSView? = getItem(position)
        val binding = SmsItemViewBinding.inflate(LayoutInflater.from(context))
        currentSms!!.phoneNo.also { binding.textViewPhoneNo.text = it }
        binding.textViewMessage.text = currentSms.msg
        return binding.root
        //return super.getView(position, convertView, parent)
    }
}