package com.example.dependencymanageandroid.di

import com.example.dependencymanageandroid.data.DemoApi
import com.example.dependencymanageandroid.data.UserRepositoryImpl
import com.example.dependencymanageandroid.domain.UserListUseCase
import com.example.dependencymanageandroid.domain.UserRepository
import com.example.dependencymanageandroid.presentation.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

object KoinModule {
    val appModule = module {
//        single<DemoApi> { DemoApi() }
        singleOf(::DemoApi)
//        single<UserRepository> { UserRepositoryImpl(get()) }
        singleOf(::UserRepositoryImpl) { bind<UserRepository>()}
//        single<UserListUseCase> { UserListUseCase(get()) }
        singleOf(::UserListUseCase)
//        viewModel { UserViewModel(get()) }
        viewModelOf(::UserViewModel)
    }
}