# Definition for singly-linked list.
#
# defmodule ListNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           next: ListNode.t() | nil
#         }
#   defstruct val: 0, next: nil
# end

defmodule Solution do
  @spec sort_list(head :: ListNode.t() | nil) :: ListNode.t() | nil
  def sort_list(head) do
    head
    |> to_sorted_list()
    |> to_list_struct()
  end

  defp to_sorted_list(node, acc_list \\ [])

  defp to_sorted_list(nil, acc_list) do
    Enum.sort(acc_list, :desc)
  end

  defp to_sorted_list(%{val: val, next: next}, acc_list) do
    to_sorted_list(next, [val | acc_list])
  end

  defp to_list_struct(list, next \\ nil)

  defp to_list_struct([head | tail], next) do
    to_list_struct(tail, %ListNode{val: head, next: next})
  end

  defp to_list_struct([], head) do
    head
  end
end
