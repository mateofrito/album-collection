export default function Songs(songs) {
    return songs
        .map(song => {
            return `
                <li class="song">
                    <h5 class="book__title">${book.title}</h5>
                    <p class="book__description">${book.description}</p>
                </li>
            `;
        }).join('')
}