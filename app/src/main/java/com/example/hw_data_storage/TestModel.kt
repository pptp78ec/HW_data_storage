package com.example.hw_data_storage

data class TestModel(
    val Question: String,
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val trueAnswer: String
)
{
    companion object Factory {

        fun buldArray(): Array<TestModel> {


        }
    }
}
