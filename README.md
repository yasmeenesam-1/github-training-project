# Portfolio App

A simple personal portfolio Android app built with **Jetpack Compose** and **Material 3** as part of the *Git & GitHub Project Management & Collaboration* training.

The app shows a single home screen containing a top app bar, a personal info header, a list of skill cards, a list of project cards, and a footer.

---

## Description

This project demonstrates a complete Git & GitHub workflow on top of a real Android codebase:

- A clean Jetpack Compose UI organized into reusable composables
- A custom brand color palette and typography in `ui/theme`
- Multiple meaningful Git commits (`Initial project setup`, `Added navbar`, `Added profile section`, `Added skills and projects cards`, `Updated styling`, `Added footer`, ...)
- A `feature/design-update` branch merged into `main` via a Pull Request
- A GitHub Issue tracking design improvements

---

## Tech Stack

- **Language:** Kotlin
- **UI Toolkit:** Jetpack Compose (Material 3)
- **Min SDK:** 24 · **Target SDK:** 36
- **Build System:** Gradle (Kotlin DSL) + Version Catalog
- **Version Control:** Git & GitHub

---

## Features

- **Top App Bar** — branded center-aligned navbar
- **Profile Section** — circular avatar, name, role, short bio
- **Skills List** — cards with emoji, skill name and proficiency level
- **Projects List** — cards with project title, description and tech stack
- **Footer** — copyright + build info
- **Light & Dark theme** — custom palette that responds to system theme

---

## Screenshots

> Replace these placeholders with real screenshots from your emulator or device.
> Save them under `docs/screenshots/` and Git will track them.

| Home (Top) | Home (Cards) | Footer |
| :---: | :---: | :---: |
| ![Home Top](docs/screenshots/home-top.png) | ![Home Cards](docs/screenshots/home-cards.png) | ![Footer](docs/screenshots/footer.png) |

---

## How to Run

### Prerequisites
- Android Studio (Hedgehog or newer)
- JDK 11+
- An Android emulator or a physical device with USB debugging

### Steps
1. **Clone the repository**
   ```bash
   git clone https://github.com/<your-username>/github-training-project.git
   cd github-training-project
   ```
2. **Open in Android Studio**
   - File → Open → select the project folder
   - Let Gradle sync finish
3. **Run the app**
   - Pick a device/emulator
   - Press ▶ Run, or:
     ```bash
     ./gradlew installDebug
     ```

---

## Project Structure

```
app/
└── src/main/
    ├── AndroidManifest.xml
    ├── java/com/example/myapplication/
    │   ├── MainActivity.kt           # PortfolioApp + ProfileHeader + SkillCard + ProjectCard + Footer
    │   └── ui/theme/
    │       ├── Color.kt              # Brand palette
    │       ├── Theme.kt              # Light & dark color schemes
    │       └── Type.kt               # Typography styles
    └── res/
        ├── values/strings.xml
        └── values/themes.xml
```

---

## Git Workflow Used

```bash
# Setup
git init
git add .
git commit -m "Initial project setup"

# Feature commits on main
git commit -m "Added navbar"
git commit -m "Added profile section with personal info"
git commit -m "Added skills and projects cards"
git commit -m "Updated styling with custom brand palette and typography"
git commit -m "Added footer"

# Feature branch
git checkout -b feature/design-update
# ...edits...
git commit -m "Improved header design"

# Push and open PR, then merge into main
git checkout main
git merge feature/design-update
```

---

## Student

**Name:** Yasmeen Esam Harara
**Course:** Git & GitHub — Project Management & Collaboration
**Track:** Mobile Development
