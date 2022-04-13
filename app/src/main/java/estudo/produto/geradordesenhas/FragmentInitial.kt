package estudo.produto.geradordesenhas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import estudo.produto.geradordesenhas.databinding.FragmentInitialBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class FragmentInitial : Fragment() {
private lateinit var binding : FragmentInitialBinding

private lateinit var geradorFragment: GeradorFragment

override fun onCreate(savedInstanceState: Bundle?) {
       binding = FragmentInitialBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

    geradorFragment = GeradorFragment()




    }

    override fun onStart() {
        super.onStart()

       lifecycleScope.launch{ transicFrag()  }

    }

    private suspend fun transicFrag(){

        delay(2000)
        parentFragmentManager.beginTransaction().replace(R.id.containerFragments, geradorFragment).commit()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        return binding.root
    }


}