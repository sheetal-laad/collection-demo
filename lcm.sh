echo "enter two integer number"
read num1 num2
mul=$(( num1*num2 ))
while [ $num1 -ne $num2 ]
do
if [ $num1 -gt $num2 ]
then
num1=$(( num1-num2 ))
else
num2=$(( num2-num1 ))
fi

done
lcm=$(( mul/num1 ))
echo "lcm is $lcm"
echo "gcd is $num1"

