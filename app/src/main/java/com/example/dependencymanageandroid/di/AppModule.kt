package com.example.dependencymanageandroid.di

import com.example.dependencymanageandroid.data.DemoApi
import com.example.dependencymanageandroid.data.UserRepositoryImpl
import com.example.dependencymanageandroid.domain.UserListUseCase
import com.example.dependencymanageandroid.domain.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDemoApi(): DemoApi {
        return DemoApi()
    }
    @Provides
    @Singleton
    fun providUserRepository(api: DemoApi): UserRepository {
        return UserRepositoryImpl(api)
    }
    @Provides
    @Singleton
    fun providUseCase(repository: UserRepository): UserListUseCase {
        return UserListUseCase(repository)
    }
}