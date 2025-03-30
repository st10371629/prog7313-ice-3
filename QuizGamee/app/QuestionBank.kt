package com.st10371629.quizgame

object QuestionBank {

    fun getScienceQuestions(): List<Question> {
        return listOf(
            Question(
                questionText = "What is the chemical symbol for gold?",
                options = listOf("Au", "Ag", "Fe", "Gd"),
                correctAnswerIndex = 0
            ),

            Question(
                questionText = "Which planet is known as the Red Planet?",
                options = listOf("Venus", "Jupiter", "Mars", "Saturn"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "What is the hardest natural substance on Earth?",
                options = listOf("Platinum", "Diamond", "Quartz", "Iron"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Which of these is NOT a state of matter?",
                options = listOf("Solid", "Liquid", "Gas", "Mineral"),
                correctAnswerIndex = 3
            ),

            Question(
                questionText = "What is the largest organ in the human body?",
                options = listOf("Heart", "Liver", "Skin", "Brain"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "Who developed the theory of relativity?",
                options = listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "What is the chemical formula for water?",
                options = listOf("H2O", "CO2", "NaCl", "O2"),
                correctAnswerIndex = 0
            ),

            Question(
                questionText = "Which element has the atomic number 1?",
                options = listOf("Oxygen", "Carbon", "Hydrogen", "Helium"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "What is the unit of electrical resistance?",
                options = listOf("Volt", "Watt", "Ampere", "Ohm"),
                correctAnswerIndex = 3
            ),

            Question(
                questionText = "Which scientist discovered penicillin?",
                options = listOf("Alexander Fleming", "Louis Pasteur", "Marie Curie", "Joseph Lister"),
                correctAnswerIndex = 0
            )
        )
    }

    fun getHistoryQuestions(): List<Question> {
        return listOf(
            Question(
                questionText = "In which year did World War II end?",
                options = listOf("1943", "1945", "1947", "1950"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Who was the first President of the United States?",
                options = listOf("Thomas Jefferson", "Abraham Lincoln", "George Washington", "John Adams"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "Which ancient civilization built the pyramids?",
                options = listOf("Romans", "Greeks", "Mayans", "Egyptians"),
                correctAnswerIndex = 3
            ),

            Question(
                questionText = "The Renaissance period began in which country?",
                options = listOf("France", "England", "Italy", "Spain"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "Who wrote 'The Communist Manifesto'?",
                options = listOf("Vladimir Lenin", "Karl Marx", "Joseph Stalin", "Friedrich Engels"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "In which year did Columbus reach the Americas?",
                options = listOf("1492", "1498", "1510", "1520"),
                correctAnswerIndex = 0
            ),

            Question(
                questionText = "Which famous ship sank on its maiden voyage in 1912?",
                options = listOf("Lusitania", "Titanic", "Queen Mary", "Britannic"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "The French Revolution began in which year?",
                options = listOf("1776", "1789", "1798", "1804"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Who was the first woman to win a Nobel Prize?",
                options = listOf("Mother Teresa", "Marie Curie", "Rosa Parks", "Florence Nightingale"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Which war is often called 'The Great War'?",
                options = listOf("American Civil War", "World War I", "World War II", "Cold War"),
                correctAnswerIndex = 1
            )
        )
    }

    fun getGeographyQuestions(): List<Question> {
        return listOf(
            Question(
                questionText = "What is the largest ocean on Earth?",
                options = listOf("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"),
                correctAnswerIndex = 3
            ),

            Question(
                questionText = "Which country has the largest population?",
                options = listOf("India", "China", "United States", "Russia"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "What is the capital of Australia?",
                options = listOf("Sydney", "Melbourne", "Canberra", "Perth"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "The Amazon River is located on which continent?",
                options = listOf("Africa", "Asia", "North America", "South America"),
                correctAnswerIndex = 3
            ),

            Question(
                questionText = "Which mountain is the tallest in the world?",
                options = listOf("K2", "Mount Everest", "Kilimanjaro", "Mont Blanc"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Which desert is the largest in the world?",
                options = listOf("Gobi Desert", "Kalahari Desert", "Sahara Desert", "Arabian Desert"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "Which European country is shaped like a boot?",
                options = listOf("Spain", "Portugal", "Greece", "Italy"),
                correctAnswerIndex = 3
            ),

            Question(
                questionText = "What is the smallest country in the world?",
                options = listOf("Monaco", "Malta", "Vatican City", "San Marino"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "The Great Barrier Reef is located off the coast of which country?",
                options = listOf("Brazil", "Australia", "Thailand", "Philippines"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Which African country was formerly known as Abyssinia?",
                options = listOf("Egypt", "Nigeria", "Ethiopia", "South Africa"),
                correctAnswerIndex = 2
            )
        )
    }

    fun getEntertainmentQuestions(): List<Question> {
        return listOf(
            Question(
                questionText = "Who directed the movie 'Titanic'?",
                options = listOf("Steven Spielberg", "James Cameron", "Christopher Nolan", "Martin Scorsese"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Which band performed the hit song 'Bohemian Rhapsody'?",
                options = listOf("The Beatles", "Led Zeppelin", "Queen", "Rolling Stones"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "Who wrote the Harry Potter book series?",
                options = listOf("J.R.R. Tolkien", "J.K. Rowling", "Stephen King", "George R.R. Martin"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Which Disney movie features the character Simba?",
                options = listOf("Aladdin", "The Lion King", "Jungle Book", "Mulan"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Who played Iron Man in the Marvel Cinematic Universe?",
                options = listOf("Chris Evans", "Chris Hemsworth", "Robert Downey Jr.", "Mark Ruffalo"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "Which TV show features characters named Ross, Rachel, and Monica?",
                options = listOf("How I Met Your Mother", "The Big Bang Theory", "Seinfeld", "Friends"),
                correctAnswerIndex = 3
            ),

            Question(
                questionText = "Who is known as the 'King of Pop'?",
                options = listOf("Michael Jackson", "Elvis Presley", "Prince", "David Bowie"),
                correctAnswerIndex = 0
            ),

            Question(
                questionText = "Which video game franchise features characters Mario and Luigi?",
                options = listOf("Pokemon", "The Legend of Zelda", "Super Mario", "Sonic the Hedgehog"),
                correctAnswerIndex = 2
            ),

            Question(
                questionText = "Who wrote the play 'Romeo and Juliet'?",
                options = listOf("Charles Dickens", "William Shakespeare", "Jane Austen", "Oscar Wilde"),
                correctAnswerIndex = 1
            ),

            Question(
                questionText = "Which actress won an Oscar for her role in 'La La Land'?",
                options = listOf("Jennifer Lawrence", "Emma Stone", "Meryl Streep", "Natalie Portman"),
                correctAnswerIndex = 1
            )
        )
    }
}