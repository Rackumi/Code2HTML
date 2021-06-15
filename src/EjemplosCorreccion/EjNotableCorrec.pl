funcion real areaCuadrado ( real lado )
inicio
	real resultado;
	resultado = 0.0;
	resultado = lado * lado;
	return resultado;
fin

procedimiento intercambioEntero ( entero v1, entero v2)
inicio
	entero aux;
	aux = 0;
	aux = v1;
	v1 = v2;
	v2 = aux;
fin

funcion entero factorialRec ( entero valorRec )
inicio
	bifurcacion ( valorRec == 1 ) 
	entonces
	inicio
		return 1;
	fin
	sino
	inicio
		entero auxRec;
		auxRec = valorRec - 1;
		return valorRec * factorialRec ( auxRec );
	fin
fin

funcion entero factorialIt ( entero valorIt )
inicio
	entero contador, acumulador;
	acumulador = 1;
	buclepara ( contador=0 ; contador == valorIt ; contador = contador + 1 )
	inicio
		acumulador = acumulador * contador;
	fin
	return acumulador;
fin

funcion entero bucle_while ( entero valorIt )
inicio
	entero contador, acumulador;
	acumulador = 1;
	buclemientras ( contador < 0 y contador <= 0 o no contador <> 0)
	inicio
		acumulador = acumulador * contador;
	fin
	return acumulador;
fin

funcion entero bucle_until ( entero valorIt )
inicio
	entero contador, acumulador;
	acumulador = 1;
	bucle
	inicio
		acumulador = acumulador * contador;
	fin
	hasta ( contador >= 0 y contador > 0 o cierto y falso )
	return acumulador;
fin

funcion entero anidados ( entero valorIt )
inicio
	entero contador, acumulador;
	acumulador = 1;
	inicio
		bucle
		inicio
			acumulador = acumulador * contador;
			bifurcacion ( valorRec == 1 ) 
			entonces
			inicio
				return 1;
			fin
			sino
			inicio
				entero auxRec;
				auxRec = valorRec - 1;
				return valorRec * factorialRec ( auxRec );
			fin
		fin
		hasta ( contador >= 0 y contador > 0 o cierto y falso )
	fin
	return acumulador;
fin