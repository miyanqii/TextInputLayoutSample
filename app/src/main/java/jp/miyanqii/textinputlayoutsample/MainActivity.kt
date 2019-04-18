package jp.miyanqii.textinputlayoutsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil
import jp.miyanqii.textinputlayoutsample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var showError = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener { toggleError() }
    }

    private fun toggleError() {
        showError = showError.not()
        when {
            showError -> {
                binding.content.apply {
                    textInputLayout1.error = "Error Message"
                    textInputLayout2.error = "Error Message"
                    textInputLayout3.error = "Error Message"
                    textInputLayout4.error = "Error Message"
                    textInputLayout5.error = "Error Message"
                    textInputLayout6.error = "Error Message"
                    textInputLayout7.error = "Error Message"
                    textInputLayout8.error = "Error Message"
                    textInputLayout9.error = "Error Message"
                    textInputLayout10.error = "Error Message"
                    textInputLayout11.error = "Error Message"
                    textInputLayout12.error = "Error Message"
                }
            }
            else -> {
                binding.content.apply {
                    textInputLayout1.error = ""
                    textInputLayout2.error = ""
                    textInputLayout3.error = ""
                    textInputLayout4.error = ""
                    textInputLayout5.error = ""
                    textInputLayout6.error = ""
                    textInputLayout7.error = ""
                    textInputLayout8.error = ""
                    textInputLayout9.error = ""
                    textInputLayout10.error = ""
                    textInputLayout11.error = ""
                    textInputLayout12.error = ""
                }

            }
        }
    }
}
