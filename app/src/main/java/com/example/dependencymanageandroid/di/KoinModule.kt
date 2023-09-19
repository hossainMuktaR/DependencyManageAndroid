package com.example.dependencymanageandroid.di

import com.example.dependencymanageandroid.data.DemoApi
import com.example.dependencymanageandroid.data.UserRepositoryImpl
import com.example.dependencymanageandroid.domain.UserListUseCase
import com.example.dependencymanageandroid.domain.UserRepository
import com.example.dependencymanageandroid.presentation.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object KoinModule {
    val appModule = module {
        single<DemoApi> { DemoApi() }
        single<UserRepository> { UserRepositoryImpl(get()) }
        single<UserListUseCase> { UserListUseCase(get()) }
        viewModel { UserViewModel(get()) }
    }
}