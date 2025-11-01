package ae.ai.radar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ae.ai.radar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTitle.text = "رادار العملات الرقمية"
        binding.btnTest.setOnClickListener {
            binding.tvTitle.text = "تم التشغيل بنجاح"
        }
    }
}
