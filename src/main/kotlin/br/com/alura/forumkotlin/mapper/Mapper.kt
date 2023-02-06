package br.com.alura.forumkotlin.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}
