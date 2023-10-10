function display(value) {
    document.getElementById("result").value += value;
  }
  
  function calculate(operator) {
    var expression = document.getElementById("result").value;
    var result = eval(expression);
    document.getElementById("result").value = result;
  }
  
  function clearScreen() {
    document.getElementById("result").value = "";
  }
  