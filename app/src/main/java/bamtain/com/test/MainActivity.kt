package bamtain.com.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lblView.text = "はろー"
        btnToast.setOnClickListener { Toast.makeText(applicationContext, "toast", Toast.LENGTH_SHORT).show() }
    }

}
