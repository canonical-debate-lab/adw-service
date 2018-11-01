package com.github.cdl.adw

import spark.Spark.*
import it.uniroma1.lcl.adw.*
import it.uniroma1.lcl.adw.ADW
import it.uniroma1.lcl.adw.LexicalItemType
import it.uniroma1.lcl.adw.utils.*
import it.uniroma1.lcl.adw.comparison.*

import java.io.File


fun main(args: Array<String>) {

    val path = File(".").getCanonicalPath();
    println(path)

    val text1 = "We should stop eating meat"
    val text2 = "Don't buy so much stuff"
    val srcTextType = LexicalItemType.SURFACE
    val trgTextType = LexicalItemType.SURFACE
    val disMethod = DisambiguationMethod.ALIGNMENT_BASED
    val measure = WeightedOverlap()
    val pipeLine = ADW()
    val similarity = pipeLine.getPairSimilarity(text1, text2,
                                                disMethod, measure,
                                                srcTextType, trgTextType)
    println(similarity)


    get("/healthz") { _, _ -> "{\"status\": \"ok\"}" }
}
