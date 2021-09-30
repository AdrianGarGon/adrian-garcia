package Ut_01

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class FIlePlayGround (private val activity: AppCompatActivity){
    /**
     * Funcion que se ejecuta al instanciar la clase (crear un objeto)
     */

    init{
        //createFile()
        //writeFile()
        //readFile()
        //appendText()
        //appendTextWithNewLine()
        //readLineByLine()
        //deleteFiles()


    }

    /**
     * asi se crean funciones y tambien tenemos como crear las variables
     * usamos el filesDir como si fuese un C/:(ir por las carpetas para coger el fichero)
     * alt + enter para importar
     * Log.d para verlo en el logcat, abajo a la izquierda, con eso lo podemos buscar ahi
     */
    fun createFile(){
        val file = File(activity.filesDir, "colors.txt")
        Log.d("@dev",activity.filesDir.absolutePath)

    }

    /**
     * funcion para escribir
     */
    fun writeFile(){
        val file = File(activity.filesDir, "colors.txt")
        file.writeText("hola Acceso a Datos")

    }

    /**
     * funcion para leer
     */
    fun readFile(){
        val file = File(activity.filesDir, "color.txt")
        val line = file.readText()

        Log.d("@dev",line)

    }

    /**
     * funcion para añadir texto
     */
    fun appendText(){
        val file = File(activity.filesDir, "color.txt")
        file.appendText("hola2")
        file.appendText("hola1")
        file.appendText("hola3")
        val line = file.readText()
        Log.d("@dev",line)


    }

    /**
     * funcion para añadir una nueva linea
     */
    fun appendTextWithNewLine(){
        val file = File(activity.filesDir, "color.txt")
        file.appendText("\n")
        file.appendText("adiossss")
        file.appendText("\n")
        file.appendText("adiossss2")
        val line = file.readText()
        Log.d("@dev",line)
    }
    fun readLineByLine(){
        val file = File(activity.filesDir, "color.text")
        file.writeText("linea1")
        file.appendText("\n")
        file.appendText("Lineaaaaaaa2")
        file.appendText("\n")
        file.appendText("Lineaaaaaaa3")

        val lines : List<String> = file.readLines()
        lines.forEach {
            Log.d("@dev", it)

        }
    }
    fun deleteFiles(){
        val file = File(activity.filesDir, "color.txt")
        if(file.exists())
            file.delete()
    }
        fun saveToFile(colors: MutableList<String>){
            /**
             * guardar en el fichero colores, leyendolos linea a linea
             */
            val file = File(activity.filesDir, "color.txt")
            if (file.exists()){
                file.writeText("")
            }
            /**
             * para usar una variable dentro de un string uso el dolar $
             */
            colors.forEach{
                file.appendText("$it\n") //it + "\n"
                Log.d("@dev",it)
            }
        }
    /**
     * funcion que lee un fichero y devuelve los colores en un listado
     * devuelve un mutable list
     */
        fun readFromFile() : MutableList<String>{
            val colors = mutableListOf<String>()
            val file = File(activity.filesDir, "color.txt")
        return if(!file.exists()){
              file.readLines().toMutableList()
        } else{
           mutableListOf()
        }
        /**
        file.readLines().forEach {
            colors.add(it)
        }
        return colors
        /**
         * otra opcion
         * return file.readLines().toMutableList()
         */

        return colors*/
            }

    }
