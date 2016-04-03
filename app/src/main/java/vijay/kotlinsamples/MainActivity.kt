package vijay.kotlinsamples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //No more findViewByIds!!
        txtTitle.setText(R.string.title)
        txtContent.setText(R.string.content)

        btnHello.setOnClickListener({view -> handleClick()});
    }

    private fun handleClick() {
        Toast.makeText(this, R.string.hello_clicked, Toast.LENGTH_SHORT).show();
    }
}
