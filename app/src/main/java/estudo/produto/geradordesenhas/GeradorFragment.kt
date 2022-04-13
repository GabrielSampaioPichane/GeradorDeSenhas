package estudo.produto.geradordesenhas

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import estudo.produto.geradordesenhas.databinding.FragmentGeradorBinding


class GeradorFragment : Fragment() {
 private lateinit var binding: FragmentGeradorBinding
 private lateinit var textResult : TextView
 private lateinit var gerar : Button
 private lateinit var copytext : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentGeradorBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        copytext = binding.copytext

        textResult = binding.resultGerador

        gerar = binding.Gerar

        gerar.setOnClickListener{

            geradorDeSenhas()

        }

        copytext.setOnClickListener{

            copiarTexto()

        }
    }


    private fun geradorDeSenhas() {
       var caracteres = listOf("A","B","C","D","E","F","G","H","I","J","K",
           "L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a",
           "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q",
           "r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7",
           "8","9","0","#","&","%","@","!","*")


    var a = caracteres.random()
        var b = caracteres.random()
        var c = caracteres.random()
        var d = caracteres.random()
        var e = caracteres.random()
        var f = caracteres.random()
        var g = caracteres.random()
        var h = caracteres.random()
        var i = caracteres.random()
        var j = caracteres.random()
        var k = caracteres.random()
        var l = caracteres.random()
        var m = caracteres.random()
        var n = caracteres.random()
        var o = caracteres.random()
        var p = caracteres.random()

        var resultado = (a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p)

        textResult.text = resultado
    }

    private fun copiarTexto() {

           val clipBoard  = activity?.getSystemService (CLIPBOARD_SERVICE) as ClipboardManager
           val clip = ClipData.newPlainText(
               "copy", textResult.text.toString()

           )

          clipBoard.setPrimaryClip(clip)
        Toast.makeText( activity,"Copiado", Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {

           return binding.root
    }


}