package com.example.responsi_092

object gambarData {
    private val fotoName = arrayOf(
        "Soekarno",
        "Soeharto",
        "Baharudin Yusuf Habibie",
        "Megawati Soekarno putri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "Soekarno adalah Presiden Pertama",
        "Soeharto adalah Presiden Kedua",
        "H.J Habibie adalah Presiden Ketiga yang sangat di kagumi kisah cintanya",
        "Megawati adalah Presiden Keempat",
        "Susilo Bambang Yudhoyono adalah Presiden Kelima",
        "Joko Widodo adalah Presiden Keenam menang 2 kali pilpres melawan prabowo"
    )

    private val gambarPoster = intArrayOf(
        R.drawable.foto1,
        R.drawable.foto2,
        R.drawable.foto3,
        R.drawable.foto4,
        R.drawable.foto5,
        R.drawable.foto6,
        R.drawable.foto1,
        R.drawable.foto4,
        R.drawable.foto5,
        R.drawable.foto6,
        R.drawable.foto1

    )

    val listgambar: ArrayList<gambar>
        get() {
            val list = arrayListOf<gambar>()
            for (position in fotoName.indices) {
                val foto = gambar()
                foto.name = fotoName[position]
                foto.detail = detail[position]
                foto.poster = gambarPoster[position]
                list.add(foto)
            }
            return list
        }

}