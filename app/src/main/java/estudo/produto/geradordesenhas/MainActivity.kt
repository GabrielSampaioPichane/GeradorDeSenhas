package estudo.produto.geradordesenhas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import estudo.produto.geradordesenhas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var initial : FragmentInitial


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

           initial = FragmentInitial()


        setFragment(initial)
    }

    private fun setFragment(fragment: Fragment) {

        val fragChange = supportFragmentManager.beginTransaction()
        fragChange.replace(R.id.containerFragments, fragment)
        fragChange.commit()

    }
}