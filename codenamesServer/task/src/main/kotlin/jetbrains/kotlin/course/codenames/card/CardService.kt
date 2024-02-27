package jetbrains.kotlin.course.codenames.card

import jetbrains.kotlin.course.codenames.utils.Utils
import jetbrains.kotlin.course.codenames.utils.words
import org.springframework.stereotype.Service

@Service
class CardService {
    fun generateWordsCards(): List<Card> {
        require(words.size >= Utils.TOTAL_NUMBER)
        return words.take(Utils.TOTAL_NUMBER).shuffled().map { Card(WordCardData(it), CardState.Front) }
            .also{words = words.drop(Utils.TOTAL_NUMBER) }
    }
}
