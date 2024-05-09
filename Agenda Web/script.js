function addTask() {
    const input_task = document.getElementById('task');
    const input_priority = document.getElementById('priority');
    const taskList = document.getElementById('task-list');

    const task = input_task.value;
    const priority = input_priority.value;

    if (task.trim() !== '') {
        const li = document.createElement('li');
        li.innerHTML = `${task} - Prioridad: ${priority} <button type="button" class="btn btn-warning" onclick="editTask(this)">Editar</button> <button type="button" class="btn btn-danger" onclick="deleteTask(this)">Eliminar</button>`;
        taskList.appendChild(li);
        input_task.value = '';
        input_priority.value = 'alta';
    }
}

function editTask(button) {
    const li = button.parentNode;
    const task = li.firstChild.nodeValue.split(' - Prioridad: ')[0];
    const priority = li.firstChild.nodeValue.split(' - Prioridad: ')[1].split(' ')[0];

    const input_task = document.getElementById('task');
    const input_priority = document.getElementById('priority');

    input_task.value = task;
    input_priority.value = priority;

    li.remove();
  }

  function deleteTask(button) {
    const li = button.parentNode;
    li.remove();
  }