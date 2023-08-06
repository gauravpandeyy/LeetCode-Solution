class Solution {
    public boolean isLongPressedName(String name, String typed) {
    if (name.equals(typed))
		return true;
	if (name.length() > typed.length())
		return false;
		
	var i = 0;
	for (var j = 0; j < typed.length(); j++)
		if (i < name.length() && name.charAt(i) == typed.charAt(j))
			i++;
		else if (j == 0 || typed.charAt(j - 1) != typed.charAt(j))
			return false;

	return i == name.length(); 
    }
}
