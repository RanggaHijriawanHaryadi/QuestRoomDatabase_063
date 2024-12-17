package com.example.pertemuan10.ui.viewmodel


import com.example.pertemuan10.data.entity.Mahasiswa

class DetailMhsViewModel (

    )
/*
Data class untuk menampung data yang akan ditampilkan diUI
* */

// memindahkan data dari entity ke ui
fun Mahasiswa.toDetailUiEvent(): MahasiswaEvent{
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}