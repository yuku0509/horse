<template>
  <form @submit.prevent="handleSubmit">
    <div>
      <label for="userid">ユーザーID</label>
      <input id="userid" v-model="userid" type="text" required />
    </div>
    <div>
      <label for="password">パスワード</label>
      <input id="password" v-model="password" type="password" required />
    </div>
    <button type="submit">送信</button>
  </form>
</template>

<script setup>
import { ref } from 'vue'

const userid = ref('')
const password = ref('')

const handleSubmit = async () => {
  const payload = {
    userid: userid.value,
    password: password.value
  }

  try {
    const response = await fetch(`${import.meta.env.VITE_API_URL}/api/login`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(payload)
    })

    if (!response.ok) {
      throw new Error('送信に失敗しました')
    }

    const result = await response.text()
    console.log('サーバー応答:', result)
  } catch (error) {
    console.error('エラー:', error)
  }
}
</script>