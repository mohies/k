read -p "Introduce primer num" va1

read -p "Introduce el siguiente num" va2

resul=`expr $va1 - $va2`
resul2=`expr $va1 + $va2`
resul3=`expr $va1 / $va2`
resul4=`expr $va1 \* $va2`


echo "sum $resul2 res $resul div $resul3 mult $resul4" 
