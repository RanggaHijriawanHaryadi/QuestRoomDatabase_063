package com.example.pertemuan10.repository

import com.example.pertemuan10.data.dao.MahasiswaDao
import com.example.pertemuan10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs{
    override suspend fun insertMhs(mahasiswa: Mahasiswa){
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    //getallmhs
    override fun getAllMhs(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }

    //getmhs
    override fun getMhs(nim: String): Flow<Mahasiswa> {
        return mahasiswaDao.getMahasiswa(nim)
    }

    //delete
    override suspend fun deleteMhs(mahasiswa: Mahasiswa) {
        return mahasiswaDao.deleteMahasiswa(mahasiswa)
    }

    //update
    override suspend fun updateMhs(mahasiswa: Mahasiswa) {
        return mahasiswaDao.updateMahasiswa(mahasiswa)
    }


}