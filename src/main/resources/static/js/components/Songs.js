export default function Songs(songs) {
    return songs
        .map(song => {
            return `
                <li class="song">
                    <h5 class="song__title">${song.songTitle}</h5>
                </li>
            `;
        }).join('')
}