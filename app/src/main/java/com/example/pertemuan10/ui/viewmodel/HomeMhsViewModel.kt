package com.example.pertemuan10.ui.viewmodel


import androidx.lifecycle.ViewModel
import com.example.pertemuan10.data.entity.Mahasiswa
import com.example.pertemuan10.repository.RepositoryMhs


class HomeMhsViewModel(
    private val repositoryMhs: RepositoryMhs
): ViewModel() {

}

data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)