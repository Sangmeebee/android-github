package camp.nextstep.edu.github.data.di

import camp.nextstep.edu.github.data.service.GithubAPI
import camp.nextstep.edu.github.data.service.RetrofitProvider

object RetrofitInjector {
    fun providesGithubAPI(): GithubAPI =
        RetrofitProvider().create(GithubAPI::class.java)
}