let display = document.getElementById('display');
let equation = '';

function appendNumber(num) {
  equation += num;
  display.value = equation;
}

function appendOperator(operator) {
  equation += operator;
  display.value = equation;
}

function clearDisplay() {
  equation = '';
  display.value = '';
}

function calculate() {
  try {
    let result = eval(equation);
    display.value = result;
    equation = String(result);
  } catch (error) {
    display.value = 'Error';
    equation = '';
  }
}