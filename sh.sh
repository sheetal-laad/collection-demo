while IFS=' ' read -r line
do
echo
for i in $line
do
echo -n $i
done
done <abc.txt

