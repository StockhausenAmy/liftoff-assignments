function detectWord(str) {
	newWord = "";
	for (i = 0; i < str.length; i++) {
		if (str.charAt(i).toLowerCase() == str.charAt(i)) {
			newWord += str.charAt(i);
		}
	}
	return newWord;
}
