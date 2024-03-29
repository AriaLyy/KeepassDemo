/*
 * Copyright (C) 2020 AriaLyy(https://github.com/AriaLyy/KeepassA)
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */


package com.lyy.demo

import android.content.Intent
import android.os.Bundle
import com.arialyy.frame.core.AbsActivity
import com.lyy.demo.databinding.ActivityLoginTestBinding

class LoginActivity : AbsActivity<ActivityLoginTestBinding>() {
  override fun setLayoutId(): Int {
    return R.layout.activity_login_test
  }

  override fun initData(savedInstanceState: Bundle?) {
    super.initData(savedInstanceState)
    binding.btLogin.setOnClickListener {
      val userName = binding.etUser.text.toString()
      val pass = binding.etPass.text.toString()
      startActivity(Intent(this, MainActivity::class.java))
      finish()
    }
  }

}