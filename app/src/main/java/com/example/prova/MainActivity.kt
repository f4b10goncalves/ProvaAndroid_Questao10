package com.example.prova

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

// Ajuste os imports abaixo de acordo com o pacote real da biblioteca de impressão.
import com.example.printer.PrintCallback
import com.example.printer.Printer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Printer().startPrint(this, "Ger7 Sistemas", object : PrintCallback {
            override fun onPrintStarted() {
                Log.i(TAG, "Impressão em andamento...")
            }

            override fun onPrintSuccess() {
                Log.i(TAG, "Impressão finalizada com sucesso.")
            }

            override fun onPrintFailed(error: String) {
                Log.e(TAG, "Falha na impressão: $error")
            }
        })
    }

    companion object {
        private const val TAG = "PrinterFlow"
    }
}
