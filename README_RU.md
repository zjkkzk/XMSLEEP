 <h1 align="center"> 📱 XMSLEEP
  </h1>

<div align="center">

Приложение для воспроизведения белого шума и природных звуков, помогающее расслабиться, сосредоточиться и лучше спать.

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-8.0%2B-green.svg)](https://www.android.com/)

[Скачать](#скачать) • [Возможности](#возможности) • [Инструкция](#инструкция)

**Language**: [中文](README.md) | [繁體中文](README_ZH_TW.md) | [English](README_EN.md) | [한국어](README_KO.md) | Русский | [日本語](README_JA.md)

<a href="https://hellogithub.com/repository/Tosencen/XMSLEEP" target="_blank"><img src="https://abroad.hellogithub.com/v1/widgets/recommend.svg?rid=3cbf370c9f534ea3bf3695b7f9b8bd19&claim_uid=Gxvd2eIyHm54S9p" alt="Featured｜HelloGitHub" style="width: 250px; height: 54px;" width="250" height="54" /></a>
</div>

## 📱 Скриншоты

<div align="center">

<table>
  <tr>
    <td align="center">
      <a href="screenshots/1.jpg"><img src="screenshots/1.jpg" alt="Скриншот 1" width="200"/></a>
    </td>
    <td align="center">
      <a href="screenshots/2.jpg"><img src="screenshots/2.jpg" alt="Скриншот 2" width="200"/></a>
    </td>
    <td align="center">
      <a href="screenshots/3.jpg"><img src="screenshots/3.jpg" alt="Скриншот 3" width="200"/></a>
    </td>
  </tr>
  <tr>
    <td align="center">
      <a href="screenshots/4.jpg"><img src="screenshots/4.jpg" alt="Скриншот 4" width="200"/></a>
    </td>
    <td align="center">
      <a href="screenshots/5.jpg"><img src="screenshots/5.jpg" alt="Скриншот 5" width="200"/></a>
    </td>
    <td align="center">
      <a href="screenshots/6.jpg"><img src="screenshots/6.jpg" alt="Скриншот 6" width="200"/></a>
    </td>
  </tr>
</table>

</div>

---

## 📱 О приложении

XMSLEEP — это профессиональное приложение для воспроизведения белого шума и природных звуков, созданное для улучшения вашего сна и концентрации. Приложение включает множество тщательно подобранных природных звуков: дождь, гром, костёр, пение птиц и многое другое.

## ✨ Возможности

### 🎵 Аудио функции
- **Множество звуков**: дождь, костёр, гром, мурлыканье кошки, птицы, сверчки и другие природные звуки
- **Онлайн аудио**: динамическая загрузка аудиоресурсов с GitHub
- **Локальное аудио**: воспроизведение аудиофайлов с вашего устройства
- **Бесшовный цикл**: непрерывное зацикленное воспроизведение
- **Регулировка громкости**: индивидуальная настройка громкости для каждого звука
- **Сохранение настроек**: громкость автоматически сохраняется и восстанавливается
- **Bluetooth гарнитура**: автоматическая пауза при отключении гарнитуры

### 🎨 Интерфейс
- **Анимации**: встроенные звуки сопровождаются WebP анимацией
- **Material Design 3**: современный дизайн
- **Переключение тем**: светлая/тёмная тема, адаптация к системной теме
- **Пользовательские темы**: выбор цветовых тем, поддержка динамических цветов

### ⚙️ Полезные функции
- **Таймер**: установка времени автоматической остановки
- **Пресеты**: 3 пресета для быстрого переключения между наборами звуков
- **Избранное**: сохранение любимых звуков
- **Недавние**: быстрый доступ к недавно воспроизводившимся звукам
- **Плавающая кнопка**: отображение текущих звуков, быстрая пауза
- **Автообновление**: проверка обновлений через GitHub Releases

## 🛠️ Технологии

- **Kotlin** - основной язык
- **Jetpack Compose** - UI фреймворк
- **Material Design 3** - дизайн-система
- **ExoPlayer/Media3** - аудиодвижок
- **OkHttp** - сетевые запросы
- **Gson** - JSON парсинг
- **Kotlinx Serialization** - JSON сериализация
- **Coil** - загрузка изображений
- **WebP** - анимации
- **MaterialKolor** - генерация цветов
- **Accompanist** - Pull-to-refresh

## 📦 Текущая версия

- **Версия**: 2.2.3
- **Version Code**: 38
- **Мин. SDK**: Android 8.0 (API 26)
- **Целевой SDK**: Android 15 (API 35)

### 🆕 Последнее обновление (v2.2.3)

#### 🎨 Новые функции
- **Виджет цитат**: виджет на главный экран с отображением времени, ежедневной цитаты и кнопки обновления

### Предыдущие версии

#### v2.2.1
- **Дыхательное упражнение**: добавлена направленная дыхательная практика
- **Экран всегда включён**: оптимизация настроек экрана
- **Погодное сопоставление**: улучшено сопоставление погоды и звуков

## 🚀 Скачать

Последняя версия доступна на [GitHub Releases](https://github.com/Tosencen/XMSLEEP/releases).

## 📋 Требования к сборке

- **Android Studio**: Hedgehog | 2023.1.1 или новее
- **JDK**: 17 или новее
- **Android SDK**: API 33 или новее
- **Gradle**: 8.0 или новее

## 🔨 Сборка

1. **Клонировать репозиторий**
   ```bash
   git clone https://github.com/Tosencen/XMSLEEP.git
   cd XMSLEEP
   ```

2. **Настроить Gradle**
   - Скопировать `gradle.properties.example` в `gradle.properties`
   - (Опционально) Настроить GitHub Token

3. **Открыть проект**
   - Открыть проект в Android Studio
   - Синхронизировать Gradle

4. **Запустить**
   - Подключить устройство или запустить эмулятор
   - Нажать кнопку запуска

## 📖 Инструкция

### Основы
1. **Воспроизведение**: нажмите на карточку звука для запуска
2. **Громкость**: нажмите на иконку громкости для регулировки
3. **Таймер**: установите время автоматической остановки

### Интерфейс
4. **Тема**: переключайтесь между светлой и тёмной темой
5. **Настройки**: настройте цвета, анимации и другое
6. **Пресеты**: сохраняйте наборы звуков для быстрого доступа
7. **Избранное**: добавляйте звуки в избранное

### Продвинутые
8. **Плавающая кнопка**: показывает текущие звуки
9. **Пакетное добавление**: добавляйте звуки в пресет из плавающей кнопки

## ⚠️ Источники звуков

- **Встроенные звуки**: из открытых аудиобиблиотек
- **Онлайн звуки**: из проекта [moodist](https://github.com/remvze/moodist) (MIT)
- **Сторонние**: от сторонних провайдеров, в соответствии с лицензиями
  - **Pixabay Content License**: [Pixabay](https://pixabay.com/service/license-summary/)
  - **CC0**: [Creative Commons Zero](https://creativecommons.org/publicdomain/zero/1.0/)

## 📄 Лицензия

Проект распространяется по лицензии [MIT](LICENSE).

## 🤝 Вклад

Приветствуются Issue и Pull Request!

### Руководство
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/AmazingFeature`)
3. Зафиксируйте изменения (`git commit -m 'Add some AmazingFeature'`)
4. Отправьте в ветку (`git push origin feature/AmazingFeature`)
5. Откройте Pull Request

## 👤 Автор

**Tosencen**

- GitHub: [@Tosencen](https://github.com/Tosencen)

## 🙏 Благодарности

- [moodist](https://github.com/remvze/moodist) - источник онлайн аудио
- [Material Design 3](https://m3.material.io/) - дизайн-гайд
- [MaterialKolor](https://github.com/material-foundation/material-color-utilities) - цвета

---

<div align="center">

**⭐ Если этот проект помог вам, поставьте Star!**

© 2026 XMSLEEP. All rights reserved.

</div>
