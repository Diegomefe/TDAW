// Datos de ejemplo para los chats
const chatData = {
    "Luis": [
        { sender: "Luis", text: "Hola, ¿cómo estás?", time: "10:00 AM" },
        { sender: "Tú", text: "Bien, ¿y tú?", time: "10:02 AM" },
        { sender: "Luis", text: "Todo bien por aquí", time: "10:05 AM" }
    ],
    "Jose": [
        { sender: "Jose", text: "¿Vas a la reunión?", time: "9:00 AM" },
        { sender: "Tú", text: "Sí, estaré allí", time: "9:05 AM" }
    ],
    "Manuel": [
        { sender: "Manuel", text: "¿Terminaste el proyecto?", time: "2:30 PM" },
        { sender: "Tú", text: "Casi, me falta poco", time: "2:35 PM" }
    ],
    "Ana": [
        { sender: "Ana", text: "¿Quedamos mañana?", time: "5:00 PM" },
        { sender: "Tú", text: "Perfecto, a las 5", time: "5:10 PM" }
    ]
};

document.addEventListener('DOMContentLoaded', function() {
    const chatButtons = document.querySelectorAll('.chat-btn');
    const chatContainer = document.getElementById('chat-container');
    const chatTitle = chatContainer.querySelector('.card-title');
    const chatMessagesContainer = chatContainer.querySelector('.direct-chat-messages');

    chatButtons.forEach(button => {
        button.addEventListener('click', function() {
            const userName = this.getAttribute('data-user');
            const userMessages = chatData[userName] || [];

            // Update chat title
            chatTitle.textContent = `Chat con ${userName}`;

            // Clear previous messages
            chatMessagesContainer.innerHTML = '';

            // Add messages to the chat
            userMessages.forEach(message => {
                const messageDiv = document.createElement('div');
                messageDiv.className = message.sender === "Tú" ?
                    'direct-chat-msg end' : 'direct-chat-msg';

                messageDiv.innerHTML = `
                    <div class="direct-chat-infos clearfix">
                        <span class="direct-chat-name float-${message.sender === "Tú" ? 'end' : 'start'}">
                            ${message.sender}
                        </span>
                        <span class="direct-chat-timestamp float-${message.sender === "Tú" ? 'start' : 'end'}">
                            ${message.time}
                        </span>
                    </div>
                    <div class="direct-chat-text">
                        ${message.text}
                    </div>
                `;

                chatMessagesContainer.appendChild(messageDiv);
            });

            // Show the chat container
            chatContainer.style.display = 'block';

            // Scroll to the chat
            chatContainer.scrollIntoView({ behavior: 'smooth' });
        });
    });
});