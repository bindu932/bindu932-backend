const taskList = document.getElementById('task-list');
const taskInput = document.getElementById('task-input');
const addTaskBtn = document.getElementById('add-task-btn');

addTaskBtn.addEventListener('click', addTask);

function addTask() {
	const taskName = taskInput.value;
	fetch('/tasks', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify({ name: taskName })
	})
	.then(response => response.json())
	.then(task => {
		const taskListItem = document.createElement('li');
		taskListItem.textContent = task.name;
		taskList.appendChild(taskListItem);
		taskInput.value = '';
	});
}

fetch('/tasks')
	.then(response => response.json())
	.then(tasks => {
		tasks.forEach(task => {
			const taskListItem = document.createElement('li');
			taskListItem.textContent = task.4;
			taskList.appendChild(taskListItem);
		});
	});
