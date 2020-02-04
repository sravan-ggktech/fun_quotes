package com.example.fun_quote_lib

import java.util.*

public class FunQuotes {

    public companion object {
        val quotes = arrayOf("It’s not a bug. It’s an undocumented feature!",
            "Software Developer – An organism that turns caffeine into software",
            "If debugging is the process of removing software bugs, then programming must be the process of putting them in – Edsger Dijkstra",
            "A user interface is like a joke. If you have to explain it, it’s not that good.",
            "I don’t care if it works on your machine! We are not shipping your machine!” – Vidiu Platon",
            "Measuring programming progress by lines of code is like measuring aircraft building progress by weight. – Bill Gates (co-founder of Microsoft)",
            "I’m very font of you because you are just my type.",
            "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
            "Things aren’t always #000000 and #FFFFFF",
            "One man’s crappy software is another man’s full time job. – Jessica Gaston",
            "Software undergoes beta testing shortly before it’s released. Beta is Latin for 'still doesn’t work.'",
            "Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live. – Martin Golding",
            "Talk is cheap. Show me the code. – Linus Torvalds",
            "Writing the first 90 percent of a computer program takes 90 percent of the time. The remaining ten percent also takes 90 percent of the time and the final touches also take 90 percent of the time. – N.J. Rubenking",
            "Old programmers never die. They simply give up their resources.",
            "Any code of your own that you haven’t looked at for six or more months might as well have been written by someone else. – (Eagleson’s Law)",
            "If at first you don’t succeed; call it version 1.0",
            "If Internet Explorer is brave enough to ask to be your default browser, You are brave enough to ask that girl out.")

        fun getQuote() = quotes[Random().nextInt(quotes.size)]
    }

    fun get() = quotes[Random().nextInt(quotes.size)]
}