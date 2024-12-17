package com.example.pertemuan10.ui.viewmodel


import com.example.pertemuan10.data.entity.Mahasiswa


class HomeMhsViewModel(
)

data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)