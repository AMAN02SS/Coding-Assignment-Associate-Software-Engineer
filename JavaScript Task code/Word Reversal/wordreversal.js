function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');
  
    // Initialize an array to store the reversed words
    const reversedWords = [];
  
    // Iterate through each word and reverse it
    for (const word of words) {
      // Reverse the word and push it to the reversedWords array
      const reversedWord = reverseWord(word);
      reversedWords.push(reversedWord);
    }
  
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  function reverseWord(word) {
    // Split the word into characters, reverse them, and join back into a word
    const reversedChars = word.split('').reverse().join('');
    return reversedChars;
  }
  
  // Example usage:
  const inputSentence = "This is a sunny day";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence); // Output: "sihT si a ynnus yad"
  