package com.example.pertemuan10.repository


import com.example.pertemuan10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    //insertmhs
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    //getallmhs
    fun getAllMhs(): Flow<List<Mahasiswa>>

    //getMhs
    fun getMhs(nim: String): Flow<Mahasiswa>
}