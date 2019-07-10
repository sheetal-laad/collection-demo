echo "enter name"
read name
reverse="$(echo "$name" | rev)"
echo $reverse
if [[ "$reverse" == "$name" ]]
then
	echo "$name is a palindrome string"
else
	echo "$name is not palindrome string"
fi
