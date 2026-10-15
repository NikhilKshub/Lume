3. Visual design

Color

Base: near-black (
#0B0B0F) for the main surface, with an elevated surface a step lighter (
#15151B).
Text: off-white primary, 60% opacity white for secondary.
Dynamic accent: extract a dominant color from the current album art and use it for the player background gradient, the progress bar, and the active lyric highlight. When there’s no art, fall back to a soft violet.
No more than one accent at a time. Everything else stays neutral.

Typography

Single family, Plus Jakarta Sans (or Inter as a fallback). Fewer fonts means less bloat.
Song title: semi-bold, large. Artist: regular, muted.
Lyrics: extra-bold, large, left-aligned. Lyric typography is what makes this style feel premium.

Shape and spacing

Rounded corners (album art ~24dp), generous padding, no divider lines (use spacing instead), and big touch targets.
4. Screens and structure

Bottom navigation with 3 tabs, plus a mini-player above it:

Library: top tabs for Songs, Albums, Artists, and Playlists. A shuffle-all button. Alphabet fast-scroll on Songs.
Search: a single search box across songs, albums, and artists.
Settings: lyrics online toggle, folders to include or exclude, sleep timer default, theme (AMOLED black or normal dark), and an About page with an open-source licenses note.

Mini-player: album art, title, play/pause, and next. Tap or swipe up to expand it into Now Playing.

Now Playing (full screen):

Large album art, title, artist, and a seek bar with times.
Controls: previous, play/pause, next, shuffle, repeat, and favorite.
A queue button that opens a bottom sheet, and a sleep timer button.
Swipe up or tap the lyrics button to switch the art area to the lyrics view.

Lyrics view

Synced: the current line is large and fully bright, with nearby lines smaller and dimmer. Lines farther away fade and blur slightly. The list auto-scrolls smoothly to keep the active line near the upper third of the screen.
Tap any line to seek to it.
Unsynced (plain) lyrics: show a normal scrollable text with no highlighting.
Not found: a calm “No lyrics found” with a retry button and an option to pick a local .lrc file.
Optional: a small offset control (±) to fix lyrics that are slightly out of sync.
5. Animation budget (and nothing more)
Mini-player expanding into Now Playing, with the album art shared and resizing smoothly.
Background gradient cross-fading when the song changes.
Play/pause icon morph.
Lyric line focus: scale, brightness, and blur easing as the active line changes.
Album art subtle scale pulse on play and pause (very gentle).

Everything else gets default, quick transitions. Respect the system’s “remove animations” setting.

6. Features: v1 vs later

v1 (build this): local library scan, background playback with a notification and lock-screen controls, queue, shuffle and repeat, favorites, simple playlists, search, synced lyrics with caching, sleep timer, dynamic colors, headset and Bluetooth button support.

Later (don’t let the agent build these yet): equalizer, widgets, Android Auto, tag editor, lyrics editor, backups.