/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function mascara(t, mask){
        
    var i = t.value.length;
    var saida = mask.substring(1,0);
    var texto = mask.substring(i);

    if (texto.substring(0,1) !== saida){
       t.value += texto.substring(0,1);
    }
 }