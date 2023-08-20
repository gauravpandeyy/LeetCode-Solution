class Solution {
    public String replaceDigits(String s) {
        var chars = s.toCharArray();
	
	for (var i = 1; i < chars.length; i += 2)
		chars[i] = (char) (chars[i - 1] + chars[i] - '0');
		
	return new String(chars);
    }
}
