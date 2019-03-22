
function on(element, eventType, callback) {
    element.addEventListener(eventType, (event) => callback(event))
}

export default {
    on
}