package com.example.dependencymanageandroid.di


import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

@Module
@ComponentScan("com.example.dependencymanageandroid")
class KoinModule

//{
//    val appModule = module {
////        single<DemoApi> { DemoApi() }
//        singleOf(::DemoApi)
////        single<UserRepository> { UserRepositoryImpl(get()) }
//        singleOf(::UserRepositoryImpl) { bind<UserRepository>()}
////        single<UserListUseCase> { UserListUseCase(get()) }
//        singleOf(::UserListUseCase)
////        viewModel { UserViewModel(get()) }
//        viewModelOf(::UserViewModel )
//    }
//}