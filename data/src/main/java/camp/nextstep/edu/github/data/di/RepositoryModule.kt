package camp.nextstep.edu.github.data.di

import camp.nextstep.edu.github.data.repository.GithubRepositoryImpl
import camp.nextstep.edu.github.domain.repository.GithubRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindsGithubRepository(
        githubRepositoryImpl: GithubRepositoryImpl
    ): GithubRepository
}