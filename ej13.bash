echo "Introduce un número:"
read numero

if [ $numero -gt 100 ]
then
   	echo "El número es mayor que 100"
else 
	if [ $numero -lt 100 ]
       	then
    		echo "El número es menor que 100"
	else
		if [ $numero -eq 100 ]
		then
			echo "El número es igual a 100"	
		fi
	fi
fi

